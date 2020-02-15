package com.revature.services;

import com.revature.repositories.CustomerFavoriteRepository;
import com.revature.repositories.SetTimeRepository;
import com.revature.repositories.StageRepository;
import com.revature.repositories.TentRepository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    private CustomerFavoriteRepository custFavRepo;
    private SetTimeRepository setTimeRepo;
    private StageRepository stageRepo;
    private TentRepository tentRepo;

}
