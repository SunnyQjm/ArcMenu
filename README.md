[![](https://jitpack.io/v/SunnyQjm/ArcMenu.svg)](https://jitpack.io/#SunnyQjm/ArcMenu)
> # 集成步骤

## 第一步： 
  * Add it in your root build.gradle at the end of repositories:
	```groovy
    allprojects {
            repositories {
                maven { url 'https://jitpack.io' }
            }
        }
    ```
    
## 第二步
  * Add the dependency
    ```groovy
    dependencies {
    	        implementation 'com.github.SunnyQjm:ArcMenu:v1.0.0'
    }
    ```
    
> # 使用方式

- ## 创建
    - Kolin
        ```kotlin
            val fab = ArcMenu.Builder(this)
                                    //设置菜单按钮的大小
                                    .size(getDimenPixelSize(R.dimen.fab_menu_size))
                                    //设置菜单按钮的图标
                                    .contentRes(R.mipmap.ic_launcher)
                                    //设置菜单的内边距
                                    .contentMargin(getDimenPixelSize(R.dimen.fab_menu_content_margin))
                                    //设置菜单放置的位置
                                    .position(FloatingButton.Position.POSITION_BOTTOM_RIGHT)
                                    //设置展开动画的时长
                                    .duration(300)
                                    .build()
        ```
    - Java
        ```java
        ArcMenu fab = ArcMenu.Builder(this)
                    //设置菜单按钮的大小
                    .size(getDimenPixelSize(R.dimen.fab_menu_size))
                    //设置菜单按钮的图标
                    .contentRes(R.mipmap.ic_launcher)
                    //设置菜单的内边距
                    .contentMargin(getDimenPixelSize(R.dimen.fab_menu_content_margin))
                    //设置菜单放置的位置
                    .position(FloatingButton.Position.POSITION_BOTTOM_RIGHT)
                    //设置展开动画的时长
                    .duration(300)
                    .build();
        ```
- ## 设置子菜单按钮显示的其实角度和终止角度（ArcMenu会根据子菜单的数量，在这个范围内均匀分布）
    - kotlin
        ```kotlin
        fab.startAngle = -90
        fab.endAngle = 0
      
        //子菜单弧形展开的半径
        fab.radius = DensityUtil.dip2px(this, 100f)
        ```
    - java
        ```java
        fab.setStartAngle(-90);
        fab.setEndAngle(0);
        fab.setRadius = DensityUtil.dip2px(this, 100f);
        ```
- ## 添加子控件
    - kotlin
        ```kotlin
        //四个参数分别是子菜单的大小，内边距，背景资源，和图标资源
        fab.addItem(getDimenPixelSize(R.dimen.fab_menu_size),
                        getDimenPixelSize(R.dimen.fab_menu_content_margin),
                        contentRes = R.mipmap.ic_launcher)
        ```
    - java
        ```java
        fab.addItem(getDimenPixelSize(R.dimen.fab_menu_size),
                                getDimenPixelSize(R.dimen.fab_menu_content_margin),
                                R.drawable.round_circle_bg, R.mipmap.ic_launcher);
        ```