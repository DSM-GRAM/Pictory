package com.gram.pictory.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.gram.pictory.Connect.Connecter.api
import com.gram.pictory.Model.LoginModel
import com.gram.pictory.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            if (idEditText.text.isNullOrBlank()) {
                Toast.makeText(this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else if(pwEditText.text.isNullOrBlank()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                api.login(hashMapOf("id" to idEditText.text, "password" to pwEditText.text)).enqueue(object : Callback<LoginModel>{
                    override fun onResponse(call: Call<LoginModel>?, response: Response<LoginModel>?) {
                        response!!.body().accessToken
                        response.body().refreshToken
                        startActivity<MainActivity>()
                    }

                    override fun onFailure(call: Call<LoginModel>?, t: Throwable?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
            }
        }
        registerTextView.setOnClickListener {
            startActivity<SignupActivity>()
        }

    }

}