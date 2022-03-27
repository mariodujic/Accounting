package com.acc.features.home.chartofaccounts.data.local.dao

import com.acc.features.home.chartofaccounts.model.ChartAccount
import kotlinx.coroutines.flow.Flow

interface ChartOfAccountsDao {

    suspend fun insertAccount(number: String, description: String)
    fun getChartOfAccounts(): Flow<List<ChartAccount>>
}