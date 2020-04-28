package com.sofency.ticket.service;

import com.sofency.ticket.mapper.TicketMapper;
import com.sofency.ticket.pojo.Ticket;
import com.sofency.ticket.pojo.TicketExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sofency
 * @date 2020/4/27 23:01
 * @package IntelliJ IDEA
 * @description
 */
@Service
public class TicketService {

    private TicketMapper ticketMapper;

    @Autowired
    public TicketService(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    //票务的信息
    public List<Integer> getGrabId(String studentId){
        TicketExample example = new TicketExample();
        example.createCriteria().andStuIdEqualTo(studentId);
        List<Ticket> tickets = ticketMapper.selectByExample(example);
        List<Integer> collect = tickets.stream().map(ticket -> ticket.getGrapId()).collect(Collectors.toList());
        return collect;
    }
}
