package com.example.utsandro_pemro3_10121265_alfaroqihswandi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
//10121282 Reza A Mardiansyah
class BottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_bottom_sheet, container, false)
        val buttonOk: Button = view.findViewById(R.id.buttonOk)
        buttonOk.setOnClickListener {
            dismiss()
        }
        return view
    }

    companion object {
        const val TAG = "BottomSheetFragment"
    }
}