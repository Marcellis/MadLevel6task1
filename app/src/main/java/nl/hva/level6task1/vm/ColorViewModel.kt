package nl.hva.level6task1.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import nl.hva.level6task1.model.ColorItem
import nl.hva.level6task1.repository.ColorRepository

class ColorViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}