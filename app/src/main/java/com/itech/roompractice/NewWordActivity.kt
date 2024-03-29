package com.itech.roompractice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

class NewWordActivity : AppCompatActivity() {
    private lateinit var mEditWordView: TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        mEditWordView = findViewById(R.id.edit_word)
        val saveBtn = findViewById<MaterialButton>(R.id.button_save)

        saveBtn.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(mEditWordView.editText?.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val word = mEditWordView.editText?.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, word)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }

    }
    companion object {
        const val EXTRA_REPLY = "com.itech.roompractice.REPLY"
    }
}