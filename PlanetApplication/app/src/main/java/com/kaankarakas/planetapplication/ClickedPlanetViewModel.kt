package com.kaankarakas.planetapplication

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClickedPlanetViewModel(planetId:Int,planetName:String):ViewModel() {
    val id = planetId

    private val _planetName = MutableLiveData<String>(planetName)
    val planetName: LiveData<String>
    get() = _planetName


    val planets= arrayOf(
        PlanetDataInfo("Earth is the third planet from the Sun and the only " +
                "astronomical object known to harbor life. While large volumes of water can be " +
                "found throughout the Solar System, only Earth sustains liquid surface water. " +
                "About 71% of Earth's surface is made up of the ocean, dwarfing Earth's polar ice, " +
                "lakes, and rivers. The remaining 29% of Earth's surface is land, consisting of continents " +
                "and islands. Earth's surface layer is formed of several slowly moving tectonic plates, " +
                "interacting to produce mountain ranges, volcanoes, and earthquakes. " +
                "Earth's liquid outer core generates the magnetic field that shapes the magnetosphere " +
                "of the Earth, deflecting destructive solar winds."),
        PlanetDataInfo("Jupiter is the fifth planet from the Sun and the largest in the Solar System. " +
                "It is a gas giant with a mass more than two and a half times that of all the other planets in the Solar " +
                "System combined, but slightly less than one-thousandth the mass of the Sun. Jupiter is the third " +
                "brightest natural object in the Earth's night sky after the Moon and Venus, and it has been observed since " +
                "prehistoric times. It was named after the Roman god Jupiter, the king of the gods." +
                "Jupiter is primarily composed of hydrogen, but helium constitutes one-quarter of its mass and one-tenth " +
                "of its volume. It probably has a rocky core of heavier elements, but, like the other giant planets in " +
                "the Solar System, it lacks a well-defined solid surface. "),
        PlanetDataInfo("Mars is the fourth planet from the Sun and the second-smallest planet in the Solar " +
                "System, only being larger than Mercury. In the English language, Mars is named for the Roman god of war. " +
                "Mars is a terrestrial planet with a thin atmosphere (less than 1% that of Earth's), and has a crust " +
                "primarily composed of elements similar to Earth's crust, as well as a core made of iron and nickel. " +
                "Mars has surface features such as impact craters, valleys, dunes and polar ice caps. It has two small " +
                "and irregularly shaped moons, Phobos and Deimos." +
                "Some of the most notable surface features on Mars include Olympus Mons, the largest volcano and " +
                "highest known mountain in the Solar System and Valles Marineris, one of the largest canyons in the " +
                "Solar System."),
        PlanetDataInfo("Pluto (minor-planet designation: 134340 Pluto) is a dwarf planet in the Kuiper belt, " +
                "a ring of bodies beyond the orbit of Neptune. It is the ninth-largest and tenth-most-massive known" +
                " object to directly orbit the Sun. It is the largest known trans-Neptunian object by volume, by a " +
                "small margin, but is slightly less massive than Eris. Like other Kuiper belt objects, Pluto is made " +
                "primarily of ice and rock and is much smaller than the inner planets. Compared to Earth's moon, Pluto " +
                "has only one sixth its mass and one third its volume." +
                "Pluto has a moderately eccentric and inclined orbit, ranging from 30 to 49 astronomical units " +
                "(4.5 to 7.3 billion kilometers; 2.8 to 4.6 billion miles) from the Sun.")
    )
    val planetInfo = planets[id].planetInfo




}