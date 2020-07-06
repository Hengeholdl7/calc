package com.apolis.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){

        zero.setOnClickListener(this)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        plus.setOnClickListener(this)
        sub.setOnClickListener(this)
        multi.setOnClickListener(this)
        divide.setOnClickListener(this)
        ac.setOnClickListener(this)
        equal.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.zero -> output.text = "${output.text.toString()}0"
            R.id.one -> output.text = "${output.text.toString()}1"
            R.id.two ->  output.text = "${output.text.toString()}2"
            R.id.three -> output.text = "${output.text.toString()}3"
            R.id.four -> output.text = "${output.text.toString()}4"
            R.id.five -> output.text = "${output.text.toString()}5"
            R.id.six -> output.text = "${output.text.toString()}6"
            R.id.seven -> output.text = "${output.text.toString()}7"
            R.id.eight -> output.text = "${output.text.toString()}8"
            R.id.nine -> output.text = "${output.text.toString()}9"
            R.id.plus -> output.text = "${output.text.toString()}+"
            R.id.sub -> output.text = "${output.text.toString()}-"
            R.id.multi -> output.text = "${output.text.toString()}*"
            R.id.divide -> output.text = "${output.text.toString()}/"
            R.id.ac -> output.text = ""
            R.id.equal -> {
                if(output.text.contains("+")){
                    var num = output.text.split("+").toTypedArray()
                    var equals = num[0].toInt() + num[1].toInt()
                    output.text = equals.toString()
                }
                else if(output.text.contains("-")){
                    var num = output.text.split("-").toTypedArray()
                    var equals = num[0].toInt() - num[1].toInt()
                    output.text = equals.toString()
                }
                else if(output.text.contains("*")){
                    var num = output.text.split("*").toTypedArray()
                    var equals = num[0].toInt() * num[1].toInt()
                    output.text = equals.toString()
                }
                else if(output.text.contains("/")){
                    var num = output.text.split("/").toTypedArray()
                    var equals = num[0].toInt() / num[1].toInt()
                    output.text = equals.toString()
                }
                else{

                }



            }
        }
    }
}