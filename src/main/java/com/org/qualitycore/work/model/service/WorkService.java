package com.org.qualitycore.work.model.service;

import com.org.qualitycore.work.model.dto.WorkDTO;
import com.org.qualitycore.work.model.entity.Work;
import com.org.qualitycore.work.model.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkService {

    private final WorkRepository workRepository;
    private final ModelMapper modelMapper;

    public List<WorkDTO> findAllWorkOrders() {

        List<Work> work = workRepository.findAll();

        return work.stream().map(works -> modelMapper.map(works, WorkDTO.class)).collect(Collectors.toList());
    }

}
