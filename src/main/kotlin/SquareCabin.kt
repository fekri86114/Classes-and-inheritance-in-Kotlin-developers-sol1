/**
 * A square cabin dwelling.
 *
 *  @param residents Current number of residents
 *  @param length Length
 */
class SquareCabin(residents: Int, private val length: Double): Dwelling(residents) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    /**
     * Calculates floor area for a square dwelling.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return length * length
    }
}