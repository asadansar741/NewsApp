package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class SelectArticle @Inject constructor(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(url:String):Article?{
        return newsRepository.getArticle(url = url)
    }

}