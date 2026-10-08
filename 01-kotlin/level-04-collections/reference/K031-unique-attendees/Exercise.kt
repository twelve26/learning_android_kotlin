package k031

fun attendees(names: List<String>): List<String> =
    names.map(String::trim).filter(String::isNotEmpty).distinct()
