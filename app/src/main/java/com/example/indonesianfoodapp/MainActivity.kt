package com.example.indonesianfoodapp


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var listView: ListView

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_food)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerList()



    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedFood(data)
            }
        })
    }

    private fun showSelectedFood(food: Food) {
        val moveWithDataIntent = Intent(this@MainActivity, ActivityDetail::class.java)

        moveWithDataIntent.putExtra(ActivityDetail.EXTRA_NAME, food.name)
        moveWithDataIntent.putExtra(ActivityDetail.EXTRA_DETAIL, food.detail)
        moveWithDataIntent.putExtra(ActivityDetail.EXTRA_IMAGE, food.photo)

        startActivity(moveWithDataIntent)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_dev_info -> {
                val intent = Intent(this, DeveloperInfoActivity::class.java)
                this.startActivity(intent)
            }
        }
    }

}