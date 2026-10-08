package k067

fun redact(fields: Map<String, String>): Map<String, String> =
    fields.mapValues { (k, v) ->
        if (k.lowercase() in setOf("password", "token")) "[REDACTED]" else v
    }
