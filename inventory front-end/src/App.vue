<script setup>
import {
  NConfigProvider,
  NDialogProvider,
  NMessageProvider,
  NNotificationProvider,
  zhCN,
  dateZhCN,
} from 'naive-ui'
</script>

<template>
  <NConfigProvider :locale="zhCN" :date-locale="dateZhCN">
    <NNotificationProvider>
      <NMessageProvider>
        <NDialogProvider>
          <RouterView />
        </NDialogProvider>
      </NMessageProvider>
    </NNotificationProvider>
  </NConfigProvider>
</template>

<style src="./assets/styles/app.css"></style>
