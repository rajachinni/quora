package com.teamtwo.quora.quorasocial.controller;
import com.teamtwo.quora.quorasocial.Entity.Social;
import com.teamtwo.quora.quorasocial.services.oldSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*

@RestController
@RequestMapping(value="/social")
public class oldSocialController {

    @Autowired
    oldSocialService socialService;

    @PostMapping(value="/save")
    Social save(@RequestBody Social social){
         return socialService.save(social);
    }

    @PostMapping(value="/generate")
    String generate(){
        Social social = new Social();
        return socialService.save(social).getSocialId();
    }

    @DeleteMapping(value="/delete")
    void delete(String socialId){
        socialService.delete(socialId);
    }

    @GetMapping(value="/countUpVote/{socialId}")
    int countUpVote(@PathVariable("socialId") String socialId){
        return socialService.countUpVote(socialId);
    }

    @GetMapping(value="/countDownVote/{socialID}")
    int countDownVote(@PathVariable("socialId") String socialId){
       return socialService.countDownVote(socialId);
    }


    @GetMapping(value="/countFunny/{socialId}")
    int countFunny(@PathVariable("socialId") String socialId){
        return socialService.countFunny(socialId);
    }

    @PostMapping(value="/addUpVote/{socialId}/{userId}")
    void addUpVote(@PathVariable("socialId")String socialId,@PathVariable("userId") String userId){
        socialService.addUpVote(socialId,userId);
    }


    @PostMapping(value="/removeUpVote/{socialId}/{userId}")
    void removeUpVote(@PathVariable("socialId") String socialId,@PathVariable("userId") String userId){
        socialService.removeUpVote(socialId,userId);
    }


    @PostMapping(value="/addFunny/{socialId}/{userId}")
    void addFunny(@PathVariable("socialId")String socialId,@PathVariable("userId")String userId){
        socialService.addFunny(socialId,userId);
    }


    @PostMapping(value="/removeFunny/{socialId}/{userId}")
    void removeFunny(@PathVariable("socialId")String socialId,@PathVariable("userId")String userId){
        socialService.removeFunny(socialId,userId);
    }


    @GetMapping(value="/getUpVotes/{socialId}/")
    List<String> getUpVotes(@PathVariable("socialId") String socialId){
        return socialService.getUpVotes(socialId);
    }


    @GetMapping(value="/getDownVotes/{socialId}")
    List<String> getDownVotes(@PathVariable("socialId") String socialId){
        return socialService.getDownVotes(socialId);
    }


    @GetMapping(value="/getFunny/{socialId}")
    List<String> getFunny(@PathVariable("socialId")String socialId){
        return socialService.getFunny(socialId);
    }



    @PostMapping(value="/addDownVote/{socialId}/{userId}")
    void addDownVote(@PathVariable("socialId") String socialId,@PathVariable("userId") String userId){
        socialService.addDownVote(socialId,userId);
    }


    @PostMapping(value="/removeDownVote/{socialId}/{userId}")
    void removeDownVote(String socialId,String userId){
        socialService.removeDownVote(socialId,userId);
    }


    @PostMapping(value="/addComment/{socialId}/{userId}/{commentString}")
    void addComment(String socialId,String userId,String commentString){
        socialService.addComment(socialId,userId,commentString);
    }


    @PostMapping(value="/removeConmment/{socialId}/{userId}")
    void removeComment(String socialId,String userId){
        socialService.removeComment(socialId,userId);
    }




}
*/
