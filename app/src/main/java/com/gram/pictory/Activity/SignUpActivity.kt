package com.gram.pictory.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gram.pictory.Connect.Connecter.api
import com.gram.pictory.R
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.toast

class SignUpActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        signUpBtn.setOnClickListener {
            if (idSignUpEditText.text.isNullOrBlank() || pwSignUpEditText.text.isNullOrBlank()
                || nameEditText.text.isNullOrBlank() || birthEditText.text.isNullOrBlank()) {
                toast("정보를 모두 입력해주세요.").show()
            } else {
                api.signUp(hashMapOf(
                    "id" to idSignUpEditText.text,
                    "password" to pwSignUpEditText.text,
                    "name" to nameEditText.text,
                    "birth" to birthEditText.text
                ))
                toast("회원가입에 성공했습니다.").show()
                finish()
            }
        }
    }
}

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

    }
}