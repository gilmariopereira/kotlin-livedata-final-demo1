package dev.gilmario.ti.viewmodeldemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0


    fun getCount() : Int {
        return count;
    }

    fun getIcrementCount() : Int {
        return count++;
    }

}