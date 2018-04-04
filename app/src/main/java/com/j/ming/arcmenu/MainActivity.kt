package com.j.ming.arcmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.j.ming.arcmenu2.ArcMenu
import com.j.ming.arcmenu2.ArcMenu.Companion.build
import com.j.ming.arcmenu2.DensityUtil
import com.j.ming.arcmenu2.FloatingButton
import com.j.ming.arcmenu2.extension.MyDelegates
import java.nio.file.Files.size

class MainActivity : AppCompatActivity() {
    private var fab by MyDelegates.notNullAndOnlyInitFirstTime<ArcMenu>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFab()
    }

    private fun initFab() {
        fab = ArcMenu.Builder(this)
                .size(getDimenPixelSize(R.dimen.fab_menu_size))
                .contentRes(R.mipmap.ic_launcher)
                .contentMargin(getDimenPixelSize(R.dimen.fab_menu_content_margin))
                .position(FloatingButton.Position.POSITION_BOTTOM_RIGHT)
                .duration(300)
                .build()

        fab.setOnClickListener {
            fab.open()
        }
        fab.startAngle = -90
        fab.endAngle = 0
        fab.radius = DensityUtil.dip2px(this, 100f)
        fab.addItem(getDimenPixelSize(R.dimen.fab_menu_size),
                getDimenPixelSize(R.dimen.fab_menu_content_margin),
                contentRes = R.mipmap.ic_launcher)
        fab.addItem(getDimenPixelSize(R.dimen.fab_menu_size),
                getDimenPixelSize(R.dimen.fab_menu_content_margin),
                contentRes = R.mipmap.ic_launcher)
        fab.addItem(getDimenPixelSize(R.dimen.fab_menu_size),
                getDimenPixelSize(R.dimen.fab_menu_content_margin),
                contentRes = R.mipmap.ic_launcher)
        fab.onArcMenuItemClickListener = object : ArcMenu.OnArcMenuItemClickListener {
            override fun onClick(position: Int, v: View?) {

            }

        }
    }
}
