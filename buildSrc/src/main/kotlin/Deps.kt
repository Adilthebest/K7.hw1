object  Deps {

    object UI {
        const val androidCore = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.5.0"
        const val material = "com.google.android.material:material:1.6.1"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val testJunit = "junit:junit:4.13.1"
        const val testJunitAndroid = "androidx.test.ext:junit:1.1.3"
        const val testEspresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val androidFragmentKTX = "androidx.fragment:fragment-ktx:1.5.2"
    }

    object DaggerHilt {
        private const val version = "2.43"
        const val daggerHiltAndroid = "com.google.dagger:hilt-android:$version"
        const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:$version"
    }

}
