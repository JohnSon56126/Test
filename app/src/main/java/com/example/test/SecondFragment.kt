package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val view = view?.findViewById<TextView>(R.id.textView)
        view?.text = selectedItem

        if (selectedItem == "Световой год"){
            view?.text = "аоио лалдктлптаьпаввроррорсвкыеунеджещзххэзжщдлшогнрепкукенгшщ\n"+
                    "" +
                    ""
        }
        if (selectedItem == "Планеты: Уран и Нептун"){
            view?.text = "\n " +
                    "\n " +
                    ""
        }
        if (selectedItem == "Планета: Сатурн"){
            view?.text = "\n " +
                    "\n" +
                    "\n" +
                    " "
        }
        if (selectedItem == "Планета: Юпитер"){
            view?.text = "\n " +
                    "\n " +
                    ""
        }
        if (selectedItem == "Планета: Марс"){
            view?.text = " \n" +
                    "\n " +
                    ""
        }
        if (selectedItem == "Планета: Венера"){
            view?.text = " \n" +
                    "\n " +
                    ""
        }
        if (selectedItem == "Планета: Меркурий"){
            view?.text = " \n" +
                    "\n " +
                    ""
        }
        if  (selectedItem == "Планета: Меркурий"){
            view?.text = " \n" +
                    "\n " +
                    ""
        }
    }

}