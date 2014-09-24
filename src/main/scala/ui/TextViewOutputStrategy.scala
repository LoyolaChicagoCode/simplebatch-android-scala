package edu.luc.etl.cs313.scala.simplebatch
package ui

import android.widget.TextView

import model.OutputStrategy

class TextViewOutputStrategy(textView: TextView) extends OutputStrategy {

  override def print(text: String) {
    textView.append(text)
  }
}
