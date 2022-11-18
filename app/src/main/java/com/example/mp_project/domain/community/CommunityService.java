package com.example.mp_project.domain.community;

import com.example.mp_project.view.Community;

public class CommunityService {

    private static CommunityService instance = new CommunityService();

    private CommunityService(){}

    public static CommunityService getInstance(){return instance;}


}
