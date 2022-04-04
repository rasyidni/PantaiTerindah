package id.co.apprasyid.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.co.apprasyid.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rvPantai:RecyclerView
    private lateinit var list: ArrayList<Pantai>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvPantai = binding.rvPantai
        rvPantai.setHasFixedSize(true)

        list.addAll(DataPantai.listPantai)
        showRecyclerView()
    }

    private fun showRecyclerView(){
        rvPantai.layoutManager = LinearLayoutManager(this)
        rvPantai.adapter = PantaiAdapter(list)
    }

}