package com.willyramad.chaptertiga.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentData()
        //intenBundle()
       // passingDataSerializable()
       // passingDataParcelble()
    }
    fun intentData(){

        // intent ke explicitintent.kt bawa data
        tombol.setOnClickListener{
            var datasatu = angkasatu.text.toString()
            var datadua = angkadua.text.toString()

            //key - value
            var inten = Intent(this, ExplicitActivity::class.java)
            inten.putExtra("angkasatu", datasatu)
            inten.putExtra("angkadua", datadua)
            startActivity(inten)
        }
    }

    // mengirim data menggunakan bundle()
  //  fun intenBundle(){
     //   var datasatu = angkasatu.text.toString()
      //  var datadua = angkadua.text.toString()

      //  var bundle = Bundle()
      //  var pindah = Intent(this, ExplicitActivity::class.java)
      //  bundle.putString("satu", datasatu)
      //  bundle.putString("dua",datadua)
       // pindah.putExtras(bundle)
       // startActivity(pindah)

   // }

   // fun passingDataSerializable(){
    //    val intent = Intent (this, SerializableActivity::class.java)
     //   val data = MahasiswaSave("willy", 1231243124, "ti")
     //   intent.putExtra("datamahasiswa", data)
      //  startActivity(Intent())
    }

    //fun passingDataParcelble(){
       // val inten = Intent (this, Parcelable::class.java)
       // var dataperson = PersonParcelable("willy", 20, "pekanbaru")
       // inten.putExtra("dataperson", dataperson)
       // startActivity(inten)
    //}
//}