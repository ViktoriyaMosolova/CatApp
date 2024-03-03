package com.mjollror.catapp.presentation.facts

sealed class FactEvent {
    data object GetFact : FactEvent()
}