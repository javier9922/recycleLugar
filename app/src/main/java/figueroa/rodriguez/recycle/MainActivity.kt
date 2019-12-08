package figueroa.rodriguez.recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Egipto","https://himbatours.com/media/k2/items/cache/afb2f0b609b92600310905cf1a1820fe_L.jpg", "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar("Mexico","https://lopezobrador.org.mx/wp-content/uploads/2019/09/15-09-2019-FESTIVAL-CULTURAS-DE-MEXICO-209-ANIVERSARIO-DE-LA-INDEPENDENCIA-.jpg", "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar("Amasonas","https://s3-eu-west-1.amazonaws.com/uploads.services.internations.org/files/2018/11/15182147/movingtoBrazil_0-2400x1350.jpg", "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar("Peru","https://www.roughguides.com/wp-content/uploads/2012/07/machu-picchu-peru-shutterstock_1044047035.jpg", "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))

        myRecicler.adapter = LugarAdapter(lugares,context = this)
        myRecicler.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

    }
}
