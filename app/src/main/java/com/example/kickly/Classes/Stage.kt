package com.example.kickly.Classes

import android.content.Context
import com.example.kickly.Activities.MainActivity
import com.example.kickly.Classes.Kickly.Companion.context
import com.example.kickly.KicklyTools
import com.example.kickly.R

enum class Stage {

    GROUPSTAGE, KNOCKOUTSTAGE;


    // override toString to use appropriate resource string
    override fun toString(): String {

        var string: String = when (this) {
            GROUPSTAGE -> context!!.resources.getString(R.string.group_stage)
            KNOCKOUTSTAGE -> context!!.resources.getString(R.string.knockout_stage)
        }

        return string
    }

    fun toString(context: Context): String {

        var string: String = when (this) {
            GROUPSTAGE -> context.resources.getString(R.string.group_stage)
            KNOCKOUTSTAGE -> context.resources.getString(R.string.knockout_stage)
        }

        return string
    }


}

