package edu.luc.etl.cs313.scala.simplebatch
package ui

import android.widget.TextView

import model.OutputStrategy

/** An output strategy that prints to an Android TextView widget. */
class TextViewOutputStrategy(textView: TextView) extends OutputStrategy {

  override def print(text: String) {
    textView.append(text)
  }
}
