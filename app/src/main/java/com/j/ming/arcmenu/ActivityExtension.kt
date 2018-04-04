package com.j.ming.arcmenu

import android.app.Activity
import android.support.annotation.*

/**
 * Created by sunny on 17-12-29.
 */


fun Activity.getDimenPixelSize(@DimenRes res: Int): Int {
    return resources.getDimensionPixelSize(res)
}

