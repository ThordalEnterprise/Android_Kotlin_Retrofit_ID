package com.example.android_kotlin_retrofit_id

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    data class SimpleJSONModel(

            // Use @SerializedName(" ") for the Gson converter
            // @field:Json(name = " ") for the Moshi converter
            // @SerialName(" ") for the Kotlinx Serialization converter
            // @JsonProperty(" ") for the Jackson converter

            @SerializedName("id")
            var employeeId: String?,

            @SerializedName("employee_name")
            var employeeName: String?,

            @SerializedName("employee_salary")
            var employeeSalary: String?,

            @SerializedName("employee_age")
            var employeeAge: String?

    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }
}