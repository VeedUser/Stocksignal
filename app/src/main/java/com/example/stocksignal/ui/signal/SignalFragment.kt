package com.example.stocksignal.ui.signal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.stocksignal.databinding.FragmentSignalBinding

class SignalFragment : Fragment() {

    private var _binding: FragmentSignalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val SignalViewModel =
            ViewModelProvider(this).get(SignalViewModel::class.java)

        _binding = FragmentSignalBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSignal
        SignalViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}