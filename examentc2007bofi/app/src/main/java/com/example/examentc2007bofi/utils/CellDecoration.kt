package com.example.secondrecycleview.utils

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CellDecoration : RecyclerView.ItemDecoration() {
    private val paint = Paint().apply {
        color = android.graphics.Color.LTGRAY
        strokeWidth = 4f
        style = Paint.Style.STROKE
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            val left = child.left.toFloat()
            val top = child.top.toFloat()
            val right = child.right.toFloat()
            val bottom = child.bottom.toFloat()
            c.drawRect(left, top, right, bottom, paint)
        }
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {

        outRect.set(8, 8, 8, 8)
    }
}
