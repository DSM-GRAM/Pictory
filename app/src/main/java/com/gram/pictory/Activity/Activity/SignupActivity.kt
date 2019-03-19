package com.gram.pictory.Activity.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.gram.pictory.R
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.startActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signUpBtn.setOnClickListener {
            if (nameEditText.text.toString().length == 0) {
                Toast.makeText(this, "이름을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (idSignUpEditText.text.toString().length == 0) {
                Toast.makeText(this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (pwSignUpEditText.text.toString().length == 0) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (birthEditText.text.toString().length == 0) {
                Toast.makeText(this, "생년월일을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else {
                startActivity<LoginActivity>()
            }
        }
    }
}