//package com.ast.ingestion.controller.impl;
//
//import com.ast.ingestion.controller.impl.CustomUtils;
//import com.ast.ingestion.controller.impl.FinalAuditDataControllerImpl;
//import com.ast.ingestion.dto.FinalAuditDataDTO;
//import com.ast.ingestion.entity.FinalAuditData;
//import com.ast.ingestion.mapper.FinalAuditDataMapper;
//import com.ast.ingestion.mapper.ReferenceMapper;
//import com.ast.ingestion.service.FinalAuditDataService;
//import org.hamcrest.Matchers;
//import org.hamcrest.core.Is;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class FinalAuditDataControllerImplTest {
//    //TODO: create the data Test generator class FinalAuditDataBuilder
//    private static final String ENDPOINT_URL = "/final-audit-datas";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private FinalAuditDataControllerImpl finalauditdataController;
//    @MockBean
//    private FinalAuditDataService finalauditdataService;
//    @MockBean
//    private FinalAuditDataMapper finalauditdataMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.finalauditdataController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(finalauditdataMapper.asDTOList(ArgumentMatchers.any())).thenReturn(FinalAuditDataBuilder.getListDTO());
//
//        Mockito.when(finalauditdataService.findAll()).thenReturn(FinalAuditDataBuilder.getListEntities());
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        Mockito.when(finalauditdataMapper.asDTO(ArgumentMatchers.any())).thenReturn(FinalAuditDataBuilder.getDTO());
//
//        Mockito.when(finalauditdataService.findById(ArgumentMatchers.anyString())).thenReturn(java.util.Optional.of(FinalAuditDataBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(finalauditdataService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(finalauditdataService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(finalauditdataMapper.asEntity(ArgumentMatchers.any())).thenReturn(FinalAuditDataBuilder.getEntity());
//        Mockito.when(finalauditdataService.save(ArgumentMatchers.any(FinalAuditData.class))).thenReturn(FinalAuditDataBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.post(ENDPOINT_URL)
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(FinalAuditDataBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(finalauditdataService, Mockito.times(1)).save(ArgumentMatchers.any(FinalAuditData.class));
//        Mockito.verifyNoMoreInteractions(finalauditdataService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(finalauditdataMapper.asEntity(ArgumentMatchers.any())).thenReturn(FinalAuditDataBuilder.getEntity());
//        Mockito.when(finalauditdataService.update(ArgumentMatchers.any(), ArgumentMatchers.anyString())).thenReturn(FinalAuditDataBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(FinalAuditDataBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(finalauditdataService, Mockito.times(1)).update(ArgumentMatchers.any(FinalAuditData.class), ArgumentMatchers.anyString());
//        Mockito.verifyNoMoreInteractions(finalauditdataService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(finalauditdataService).deleteById(ArgumentMatchers.anyString());
//        mockMvc.perform(
//                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(finalauditdataService, Mockito.times(1)).deleteById(Mockito.anyString());
//        Mockito.verifyNoMoreInteractions(finalauditdataService);
//    }