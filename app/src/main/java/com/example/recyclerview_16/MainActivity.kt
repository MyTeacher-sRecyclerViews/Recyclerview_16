package com.example.recyclerview_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val users = addedListUser()
        refreshAdapter(users)
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val decoration = SpaceItemDecoration(10)
        recyclerView.addItemDecoration(decoration)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView.adapter = adapter
    }

    private fun addedListUser(): ArrayList<Member> {
        val members = ArrayList<Member>()

        for (i in 0..30) {
            members.add(Member("Android", "$i"))
        }
        return members
    }
}