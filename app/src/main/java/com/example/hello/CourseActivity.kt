package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*

class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
    }
}
data class Collectivity(val courses_id:Int, val courses_name:String, val course_code:Int, val instructor:String, val Description:String)
class courseactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)
        rvcourses.layoutManager = LinearLayoutManager(baseContext)
        CoursesActivityRecyclerViewAdapter(
            coursesactivity = listOf(
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1"),
                Collectivity(5006, "mercy", 4004, "Ndung'u", "Kotline project1")

            )
        )


        val rvCoursesActivity = null
        val coursesAdapter = null
        val value: Any = rvCoursesActivity.= coursesAdapter
                



    }

    private fun CoursesActivityRecyclerViewAdapter(
        listOf: List<Any>,
        coursesactivity: List<Collectivity>
    ) {

    }

}
