package com.kunzisoft.keepass.database.element.database

import java.util.*

class CustomIconPool : BinaryPool<UUID>() {

    override fun findUnusedKey(): UUID {
        var newUUID = UUID.randomUUID()
        while (pool.containsKey(newUUID)) {
            newUUID = UUID.randomUUID()
        }
        return newUUID
    }
}