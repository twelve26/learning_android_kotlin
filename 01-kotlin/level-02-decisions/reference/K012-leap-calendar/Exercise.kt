package k012

fun leap(year: Int): Boolean = year % 400 == 0 || year % 4 == 0 && year % 100 != 0
