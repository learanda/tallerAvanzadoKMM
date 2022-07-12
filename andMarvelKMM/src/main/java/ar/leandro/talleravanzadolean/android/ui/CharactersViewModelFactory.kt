package ar.leandro.talleravanzadolean.android.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ar.leandro.talleravanzadolean.CharactersService

class CharactersViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val charactersService = CharactersService()
        return CharactersViewModel(charactersService) as T
    }
}