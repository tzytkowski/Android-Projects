package com.example.studenthierarchy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val freshman = UndergraduateStudent("Tilly", "123", 22.0, 300.0)
        val sophomore = UndergraduateStudent("Mike", "345", 18.0, 325.0)
        val junior = UndergraduateStudent("Junior", "765", 16.0, 350.0)
        val senior = UndergraduateStudent("Allie", "453", 15.0, 375.0)
        val masters = GraduateStudent("William", "546", 8.0, 750.0, 4.0)
        val doctorate = GraduateStudent("Tim", "543", 4.0, 1000.0, 3.0)
        // Find the TextViews by their IDs
        val freshmanTextView = findViewById<TextView>(R.id.freshman)
        val nameTextView = findViewById<TextView>(R.id.name)
        val creditHoursTextView = findViewById<TextView>(R.id.credithours)
        val costCreditHourTextView = findViewById<TextView>(R.id.costcredithour)
        val tuitionTextView = findViewById<TextView>(R.id.tuition)
        val button = findViewById<Button>(R.id.button)
        val clearButton = findViewById<Button>(R.id.clearbutton)


        // Update the TextViews with student information
        freshmanTextView.text = "Freshman"
        nameTextView.text = "Student Name: ${freshman.name}"
        creditHoursTextView.text = "Credit Hours: ${freshman.creditHours}"
        costCreditHourTextView.text = "Cost per Credit Hour: ${String.format("$%,.2f", freshman.costCreditHour)}"
        button.setOnClickListener({ tuitionTextView.text = "Tuition: ${String.format("$%,.2f", freshman.calculateTuition())}" })
        clearButton.setOnClickListener({ tuitionTextView.text = ""})


        main()
    }
    open class Student(val name: String, val studentId: String, val creditHours: Double) {
        open fun calculateTuition(): Double {
            return (creditHours * 0.0)
        }

    }

    class UndergraduateStudent(name: String, studentId: String, creditHours: Double, val costCreditHour: Double) : Student(name, studentId, creditHours) {
        override fun calculateTuition(): Double {
            return creditHours * costCreditHour
        }
    }

    class GraduateStudent(name: String, studentId: String, creditHours: Double, val costCreditHour: Double, val graduateFee: Double) : Student(name , studentId, creditHours) {
        override fun calculateTuition(): Double {
            return ((creditHours * costCreditHour) + graduateFee)
        }
    }
    fun main() {

    }

}