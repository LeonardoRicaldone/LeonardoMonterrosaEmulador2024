package Leonardo.Monterrosa.emulador_20230070_leonardo.ui.dashboard

import Leonardo.Monterrosa.emulador_20230070_leonardo.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import Leonardo.Monterrosa.emulador_20230070_leonardo.databinding.FragmentDashboardBinding
import android.util.Log
import android.widget.Button

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val saludo = "Hola Imprime mi nombre"
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.btnNombre
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = saludo

val btnNombre = view?.findViewById<Button>(R.id.btnNombre)
            btnNombre?.setOnClickListener {
                Log.d("Hola", "Mi nombre es Leonardo Benjamin Monterrosa Nuñez")
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}