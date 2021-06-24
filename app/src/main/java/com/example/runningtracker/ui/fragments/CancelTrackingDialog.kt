package com.example.runningtracker.ui.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.runningtracker.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CancelTrackingDialog : DialogFragment() {

    private var yesListener: (()-> Unit)? =null

    fun setYesListener(listener : () -> Unit) {
        yesListener = listener
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
                .setTitle("달리기를 취소하시겠습니까?")
                .setMessage("현재 실행을 취소하고 해당 데이터를 모두 삭제하시겠습니까?")
                .setIcon(R.drawable.ic_delete)
                .setPositiveButton("네") { _, _ ->
                   // stopRun()
                    yesListener?.let { yes ->
                        yes()
                    }
                }
                .setNegativeButton("아니요") { dialogInterface, _ ->
                    dialogInterface.cancel()
                }
                .create()
    }
}