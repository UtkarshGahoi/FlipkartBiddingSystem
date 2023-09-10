package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterMember {
    Integer eventId;
    Integer memberId;
    private Map<String,List<String>> RegisterMap=new HashMap<>();

    public void RegisterMemberForEvent (String eventId, String memberId) throws MemberNotFoundException, EventNotFoundException {
        List<Integer> memberList = Member.getMemberList();
        List<String> eventList=Event.getEventList();
        if(!eventList.contains(eventId)){
            throw new EventNotFoundException("Member with ID " + memberId + " not found.");
        }
        if(memberList.contains(memberId)) {
            if(RegisterMap.containsKey(eventId)){
                List<String>eventAttendees = RegisterMap.get(eventId);
                eventAttendees.add(memberId);
                RegisterMap.put(eventId,eventAttendees);
            }
            else{
                List<String>eventAttendees=new ArrayList<>();
                eventAttendees.add(memberId);
                RegisterMap.put(eventId,eventAttendees);

            }
        }
        else{
            throw new MemberNotFoundException("Member with ID " + memberId + " not found.");
        }
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
    public Map<String,List<String>> getRegisterMap(){
        return RegisterMap;
    }
}
