package ar.leandro.talleravanzadolean.android.ui.holder

import androidx.recyclerview.widget.RecyclerView
import ar.leandro.talleravanzadolean.android.databinding.ListItemCharacterBinding
import ar.leandro.talleravanzadolean.model.Character
import com.squareup.picasso.Picasso

class CharacterViewHolder(private val binding: ListItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(character: Character) {
        binding.name.text = character.name
        binding.description.text = character.description
        if (character.thumbnailUrl.isNotEmpty()) {
            Picasso.get()
                .load(character.thumbnailUrl)
                .into(binding.image)
        } else {
            binding.image.setImageURI(null)
        }
    }

}
