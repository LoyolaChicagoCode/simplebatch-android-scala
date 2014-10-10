package edu.luc.etl.cs313.scala.simplebatch
package ui

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log

import model.ConcreteBatchTask

/** The main Android activity, which provides the required lifecycle methods. */
class MainActivity extends Activity with TypedActivity {

  private def TAG = "simplebatch-android-activity"

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    Log.i(TAG, "onCreate")
    // load main GUI layout
    setContentView(R.layout.main)
    findView(TR.textview).setMovementMethod(new ScrollingMovementMethod)
  }

  override def onStart(): Unit = {
    super.onStart()
    Log.i(TAG, "onStart")
    val outputStrategy = new TextViewOutputStrategy(findView(TR.textview))
    val task = new ConcreteBatchTask(outputStrategy)
    task.run()
  }
}
