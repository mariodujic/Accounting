package com.acc.features.home.partners.data.repository

import com.acc.features.home.partners.data.local.dao.PartnersDao
import com.acc.features.home.partners.model.Partner
import kotlinx.coroutines.flow.Flow

class PartnersRepository(private val dao: PartnersDao) {

    suspend fun insertPartner(name: String, address: String, phoneNumber: String) {
        dao.insertPartner(name, address, phoneNumber)
    }

    suspend fun deletePartner(id: String) {
        dao.deletePartner(id)
    }

    suspend fun getPartnerById(id: String): Partner? {
        return dao.getPartnerById(id)
    }

    fun getPartners(): Flow<List<Partner>> {
        return dao.getPartners()
    }
}