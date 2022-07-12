package ar.leandro.talleravanzadolean.android.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.leandro.talleravanzadolean.android.databinding.ListItemCharacterBinding
import ar.leandro.talleravanzadolean.android.ui.holder.CharacterViewHolder
import ar.leandro.talleravanzadolean.model.Character

class CharactersAdapter : RecyclerView.Adapter<CharacterViewHolder>() {

    private val charactersList = mutableListOf<Character>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(ListItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItemAt(position))
    }

    override fun getItemCount() = charactersList.size

    fun submitList(characters: List<Character>) {
        with(charactersList) {
            clear()
            addAll(characters)
        }
        notifyDataSetChanged()
    }

    private fun getItemAt(position: Int) = charactersList[position]
}