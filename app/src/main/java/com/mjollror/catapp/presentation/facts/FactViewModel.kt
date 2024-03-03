package com.mjollror.catapp.presentation.facts

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mjollror.catapp.domain.useCases.GetFactUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class FactViewModel @Inject constructor(
    private val factUseCase: GetFactUseCase
) : ViewModel() {
    private val _state = mutableStateOf(FactState())
    val state = _state

    init {
        onEvent(FactEvent.GetFact)
    }

    fun onEvent(event: FactEvent) {
        when (event) {
            is FactEvent.GetFact -> {
                viewModelScope.launch {
                    try {
                        val catFactModel = factUseCase()
                        _state.value = FactState(fact = catFactModel.fact)
                    } catch (e: Exception) {
                        _state.value = FactState(error = e.message ?: "Unknown error")
                    }
                }
            }
        }
    }
}