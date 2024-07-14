package com.example.bankingappui.tools

import android.content.Context
import android.widget.Toast


fun Context.toast(text: CharSequence) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()