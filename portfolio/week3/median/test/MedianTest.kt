// COMP2850 Portfolio: Week 3
// Tests for median()
//Aleksandr Pivovarov

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    
    "Median of one element" {
        median(listOf(3.9f)) shouldBe (3.9f plusOrMinus tolerance)
    }

    "Median of two elements" {
        median(listOf(1.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }

    "Median of three elements" {
        median(listOf(20.0f, 2.0f, 19.0f)) shouldBe (19.0f plusOrMinus tolerance)
    }

    "Median of four elements" {
        median(listOf(11.0f, 2.0f, 6.0f, 11.0f)) shouldBe (8.5f plusOrMinus tolerance)
    }

})


