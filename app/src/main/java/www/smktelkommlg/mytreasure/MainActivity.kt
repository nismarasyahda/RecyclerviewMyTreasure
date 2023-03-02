package www.smktelkommlg.mytreasure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Member> = arrayListOf()
    private var title: String = "Mode List"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)


        rvHeroes = findViewById(R.id.rv_hero)
        rvHeroes.setHasFixedSize(true)

        list.addAll(MemberData.listData)
        showRecyclerList()
    }
    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridTreasureAdapter(list)
        rvHeroes.adapter = gridHeroAdapter
        gridHeroAdapter.setOnItemClickCallback(object : GridTreasureAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Member) {
                showSelectedTreasure(data)
            }
        })

    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listTreasureAdapter = ListTreasureAdapter(list)
        rvHeroes.adapter = listTreasureAdapter
        listTreasureAdapter.setOnItemClickCallback(object : ListTreasureAdapter.OnItemClickCallback {
             override fun onItemClicked(data: Member) {
                showSelectedTreasure(data)
            }
        })


        }
    private fun showRecyclerCardView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewTreasureAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter
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
            R.id.action_list -> {
                title = "Mode List"

                showRecyclerList()

            }

            R.id.action_grid -> {
                title = "Mode Grid"

                showRecyclerGrid()

            }


            R.id.action_cardview -> {
                title = "Mode CardView"

                showRecyclerCardView()

            }
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showSelectedTreasure(member: Member) {
        Toast.makeText(this, "Kamu memilih " + member.name, Toast.LENGTH_SHORT).show()
    }
}

