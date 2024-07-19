package com.TradeTracker.dto;

import java.util.Date;
import java.util.Set;

import com.TradeTracker.entity.Order;
import com.TradeTracker.entity.Portfolio;
import com.TradeTracker.entity.Transaction;
import com.TradeTracker.entity.User;
import com.TradeTracker.entity.Watchlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginRequest {
    private String email;
    private String password;

    // getters and setters
}


